package com.aihecun.blogs.annotations.dbmodel.interpreter;

import com.aihecun.blogs.annotations.dbmodel.Column;
import com.aihecun.blogs.annotations.dbmodel.DBIgnoreField;
import com.aihecun.blogs.annotations.dbmodel.PK;
import com.aihecun.blogs.annotations.dbmodel.Table;
import com.aihecun.blogs.util.AfStringUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * db.annotation 解释器
 * @author yp
 * @date 2016-01-15 10:46:18 中国标准时间
 */
public class Interpreter {
	
	/**
	 * 获取field是否是数据库列
	 * @param field
	 * @return
	 */
	public static boolean isColumn(Field field) {
		int modify = field.getModifiers();
		return !Modifier.isFinal(modify) && !Modifier.isStatic(modify) 
				&& !Modifier.isTransient(modify) 
				&& !field.isAnnotationPresent(DBIgnoreField.class);
	}
	/**
	 * 获取field的列名称
	 * @param field
	 * @return
	 */
	public static String getColumnName(Field field) {
		if (field.isAnnotationPresent(Column.class)) {
			Column column = field.getAnnotation(Column.class);
			if (AfStringUtil.isNotEmpty(column.columnName())) {
				return column.columnName();
			}
		}
		if (field.isAnnotationPresent(PK.class)) {
			PK PK = field.getAnnotation(PK.class);
			if (AfStringUtil.isNotEmpty(PK.columnName())) {
				return PK.columnName();
			}
		}
		return field.getName();
	}
	/**
	 * 获取clazz数据表名称
	 * @param clazz
	 * @return
	 */
	public static String getTableName(Class<?> clazz) {
		if (clazz.isAnnotationPresent(Table.class)) {
			Table table = clazz.getAnnotation(Table.class);
			if (table.tableName() != null && table.tableName().length() > 0) {
				return table.tableName();
			}
		}
		return clazz.getSimpleName();
	}
	/**
	 * 获取clazz的主键ID名称
	 * @param clazz
	 * @return
	 */
	public static String getPKName(Class<?> clazz) {
		Field field = getPKField(clazz);
		if (field != null) {
			PK PK = field.getAnnotation(PK.class);
			if (PK == null || PK.columnName().trim().length() == 0) {
				return field.getName();
			}
			return PK.columnName();
		}
		return "ID";
	}

	/**
	 * 获取clazz的主键ID名称
	 * @param clazz
	 * @return
	 */
	public static Field getPKField(Class<?> clazz) {
		List<Field> fields = new ArrayList<Field>();
		while (!clazz.equals(Object.class)) {
			for (Field field : clazz.getDeclaredFields()) {
				fields.add(field);
			}
			clazz = clazz.getSuperclass();
		}
		List<Field> cloumns = new ArrayList<Field>();
		for (Field field : fields) {
			if (isColumn(field)) {
				if (isPrimaryKey(field)) {
					return field;
				}
				cloumns.add(field);
			}
		}
		for (Field field : cloumns) {
			String name = field.getName().toLowerCase(Locale.ENGLISH);
			if (name.endsWith("isColumnPK")) {
				return field;
			}
		}
		return null;
	}

	/**
	 * 判断 Field 是否为PK ID字段
	 * @param field
	 * @return
	 */
	public static boolean isPrimaryKey(Field field) {
		return field.isAnnotationPresent(PK.class)
				|| (field.isAnnotationPresent(Column.class)
				&& field.getAnnotation(Column.class).isColumnPK());
	}


}
