CREATE TABLE "tb_articles" ("idArticle" varchar(64) NOT NULL,"idUser" varchar(64) NOT NULL,"title" varchar(512) DEFAULT NULL,"countComment" int4 DEFAULT 0,"flagShare" bool DEFAULT true,"flagComment" bool DEFAULT true,"flagAccess" bool DEFAULT true,"flag" bool DEFAULT true,"timeCreated" timestamp(6) DEFAULT NULL,"timeUpdated" timestamp(6) DEFAULT NULL,CONSTRAINT "tb_articles_pk" PRIMARY KEY ("idArticle") ,CONSTRAINT "tb_articles_pk" UNIQUE ("idArticle"));COMMENT ON COLUMN "tb_articles"."idArticle" IS '文章id，主键';COMMENT ON COLUMN "tb_articles"."idUser" IS '用户id， 外键';COMMENT ON COLUMN "tb_articles"."title" IS '文章标题';COMMENT ON COLUMN "tb_articles"."countComment" IS '文章评论数目';COMMENT ON COLUMN "tb_articles"."flagShare" IS '分享标识';COMMENT ON COLUMN "tb_articles"."flagComment" IS '评论标识';COMMENT ON COLUMN "tb_articles"."flagAccess" IS '访问标识';COMMENT ON COLUMN "tb_articles"."flag" IS '文章标识，true 正常，false 删除';COMMENT ON COLUMN "tb_articles"."timeCreated" IS '创建时间';COMMENT ON COLUMN "tb_articles"."timeUpdated" IS '更新时间';CREATE TABLE "tb_comments" ("idComment" varchar(64) NOT NULL,"idUser" varchar(64) NOT NULL,"idSection" varchar(64) NOT NULL,"idReply" varchar(64) NOT NULL,"timeCreated" timestamp(6) DEFAULT NULL,"contents" text,"flag" bool DEFAULT true,CONSTRAINT "tb_comments_pk" PRIMARY KEY ("idComment") ,CONSTRAINT "tb_comments_pk" UNIQUE ("idComment"));COMMENT ON COLUMN "tb_comments"."idComment" IS '评论id,主键';COMMENT ON COLUMN "tb_comments"."idUser" IS '用户id， 外键';COMMENT ON COLUMN "tb_comments"."idSection" IS '章节 id， 外键';COMMENT ON COLUMN "tb_comments"."idReply" IS '回复id，外键';COMMENT ON COLUMN "tb_comments"."timeCreated" IS '创建时间';COMMENT ON COLUMN "tb_comments"."contents" IS '评论内容';COMMENT ON COLUMN "tb_comments"."flag" IS '评论标识， true 正常， false 删除';CREATE TABLE "tb_fans" ("idFans" varchar(64) NOT NULL,"idUser" varchar(64) NOT NULL,"userNo" varchar(64) NOT NULL,"flag" bool DEFAULT true,"timeCreated" timestamp(6) DEFAULT NULL,CONSTRAINT "tb_fans_pk" PRIMARY KEY ("idFans") ,CONSTRAINT "tb_fans_pk" UNIQUE ("idFans"));COMMENT ON COLUMN "tb_fans"."idFans" IS '粉丝id， 主键';COMMENT ON COLUMN "tb_fans"."idUser" IS '用户 id,外键';COMMENT ON COLUMN "tb_fans"."userNo" IS '用户号，外键';COMMENT ON COLUMN "tb_fans"."flag" IS '粉丝标识，true 为正常，false 为取消粉丝关系';COMMENT ON COLUMN "tb_fans"."timeCreated" IS '创建时间';CREATE TABLE "tb_friends" ("idFriend" varchar(64) NOT NULL,"idUser" varchar(64) NOT NULL,"userNo" varchar(64) NOT NULL,"flag" bool DEFAULT true,"timeCreated" timestamp(6) DEFAULT NULL,CONSTRAINT "tb_friends_pk" PRIMARY KEY ("idFriend") ,CONSTRAINT "tb_friends_pk" UNIQUE ("idFriend"));COMMENT ON COLUMN "tb_friends"."idFriend" IS '好友id，主键';COMMENT ON COLUMN "tb_friends"."idUser" IS '用户id，外键';COMMENT ON COLUMN "tb_friends"."userNo" IS '好友，外键';COMMENT ON COLUMN "tb_friends"."flag" IS '状态标识';COMMENT ON COLUMN "tb_friends"."timeCreated" IS '创建时间';CREATE TABLE "tb_notes" ("idNote" varchar(64) NOT NULL,"idUser" varchar(64) NOT NULL,"title" varchar(255) DEFAULT NULL,"contents" text DEFAULT NULL,"flagAccess" bool DEFAULT true,"flag" bool DEFAULT true,"timeCreated" timestamp(6) DEFAULT NULL,CONSTRAINT "tb_notes_pk" PRIMARY KEY ("idNote") ,CONSTRAINT "tb_notes_pk" UNIQUE ("idNote"));COMMENT ON COLUMN "tb_notes"."idNote" IS '笔记id，主键';COMMENT ON COLUMN "tb_notes"."idUser" IS '用户id，外键';COMMENT ON COLUMN "tb_notes"."title" IS '笔记标题';COMMENT ON COLUMN "tb_notes"."contents" IS '内容';COMMENT ON COLUMN "tb_notes"."flagAccess" IS '访问标识';COMMENT ON COLUMN "tb_notes"."flag" IS '状态标识';COMMENT ON COLUMN "tb_notes"."timeCreated" IS '创建时间';CREATE TABLE "tb_roles" ("idRole" varchar(10) NOT NULL,"roleName" varchar(32) DEFAULT NULL,"flagRole" bool DEFAULT true,"flag" bool DEFAULT true,CONSTRAINT "tb_role_pk" PRIMARY KEY ("idRole") ,CONSTRAINT "tb_roles_pk" UNIQUE ("idRole"));COMMENT ON COLUMN "tb_roles"."roleName" IS ' 角色名称';COMMENT ON COLUMN "tb_roles"."flagRole" IS '角色标识';COMMENT ON COLUMN "tb_roles"."flag" IS '状态标识';CREATE TABLE "tb_says" ("idSay" varchar(64) NOT NULL,"idUser" varchar(64) NOT NULL,"idComment" varchar(64) DEFAULT NULL,"idReply" varchar(64) DEFAULT NULL,"contents" text DEFAULT NULL,"timeCreated" timestamp(6) DEFAULT NULL,"flag" bool DEFAULT true,CONSTRAINT "tb_says_pk" PRIMARY KEY ("idSay") ,CONSTRAINT "tb_says_pk" UNIQUE ("idSay"));COMMENT ON COLUMN "tb_says"."idSay" IS '说说id，主键';COMMENT ON COLUMN "tb_says"."idUser" IS '用户id，外键';COMMENT ON COLUMN "tb_says"."idComment" IS '评论id,外键，参考idSay';COMMENT ON COLUMN "tb_says"."idReply" IS '回复id,外键，参考idSay';COMMENT ON COLUMN "tb_says"."contents" IS '内容';COMMENT ON COLUMN "tb_says"."timeCreated" IS '创建时间';COMMENT ON COLUMN "tb_says"."flag" IS '状态标识';CREATE TABLE "tb_sections" ("idSection" varchar(64) NOT NULL,"idArticle" varchar(64) NOT NULL,"title" varchar(512),"contents" text,"flag" bool DEFAULT true,CONSTRAINT "tb_sections_pk" PRIMARY KEY ("idSection") ,CONSTRAINT "tb_sections_pk" UNIQUE ("idSection"));COMMENT ON COLUMN "tb_sections"."idSection" IS '章节id，主键';COMMENT ON COLUMN "tb_sections"."idArticle" IS '文章id， 外键';COMMENT ON COLUMN "tb_sections"."title" IS '章节标题';COMMENT ON COLUMN "tb_sections"."contents" IS '章节内容';COMMENT ON COLUMN "tb_sections"."flag" IS '章节标识， true 正常， false 删除';CREATE TABLE "tb_shares" ("idShare" varchar(64) NOT NULL,"idUser" varchar(64),"description" text,"timeCreated" timestamp(6),"shareUrl" varchar(2048),"flag" bool DEFAULT true,CONSTRAINT "tb_shares_pk" PRIMARY KEY ("idShare") ,CONSTRAINT "tb_shares_pk" UNIQUE ("idShare"));CREATE TABLE "tb_users" ("idUser" varchar(64) NOT NULL,"userNo" varchar(13) NOT NULL DEFAULT NULL::character varying,"idRole" varchar(10) DEFAULT NULL::character varying,"userName" varchar(20) DEFAULT NULL::character varying,"password" varchar(64) DEFAULT NULL::character varying,"userTitle" varchar(20) DEFAULT NULL::character varying,"sex" int4,"birthday" date,"bitCoins" int8 DEFAULT 0,"email" varchar(64) DEFAULT NULL::character varying,"address" varchar(256) DEFAULT NULL::character varying,"mobile" varchar(12) DEFAULT NULL::character varying,"flag" bool DEFAULT true,"countFans" int4 DEFAULT 0,"countArticle" int4 DEFAULT 0,"countShare" int4 DEFAULT 0,"countComment" int4 DEFAULT 0,"countSays" int4 DEFAULT 0,"timeCreated" timestamp(6),"timeLastLogin" timestamp(6),"timeUpdated" timestamp(6),CONSTRAINT "tb_users_pkey" PRIMARY KEY ("idUser", "userNo") ,CONSTRAINT "tb_users_pk1" UNIQUE ("idUser"),CONSTRAINT "tb_users_pk2" UNIQUE ("userNo"));COMMENT ON COLUMN "tb_users"."idUser" IS '用户id，主键';COMMENT ON COLUMN "tb_users"."userNo" IS '用户号码，唯一';COMMENT ON COLUMN "tb_users"."idRole" IS '角色id';COMMENT ON COLUMN "tb_users"."userName" IS '用户名';COMMENT ON COLUMN "tb_users"."password" IS '用户密码';COMMENT ON COLUMN "tb_users"."userTitle" IS '用户等级称呼';COMMENT ON COLUMN "tb_users"."sex" IS '用户性别';COMMENT ON COLUMN "tb_users"."birthday" IS '出生日期';COMMENT ON COLUMN "tb_users"."bitCoins" IS '用户积分';COMMENT ON COLUMN "tb_users"."email" IS '电子邮件';COMMENT ON COLUMN "tb_users"."address" IS '详细地址';COMMENT ON COLUMN "tb_users"."mobile" IS '移动电话';COMMENT ON COLUMN "tb_users"."flag" IS '用户标识';COMMENT ON COLUMN "tb_users"."countFans" IS '粉丝数';COMMENT ON COLUMN "tb_users"."countArticle" IS '文章数';COMMENT ON COLUMN "tb_users"."countShare" IS '分享数';COMMENT ON COLUMN "tb_users"."countComment" IS '平路数';COMMENT ON COLUMN "tb_users"."countSays" IS '说说数';CREATE TABLE "tb_words" ("idWord" varchar(64) NOT NULL,"idUser" varchar(64) DEFAULT NULL::character varying,"word" varchar(40) DEFAULT NULL::character varying,"phonetic" varchar(30) DEFAULT NULL::character varying,"pronounce" bytea,"timeCreated" timestamp(6) DEFAULT NULL,"timeUpdated" timestamp(6) DEFAULT NULL,CONSTRAINT "tb_words_pk" PRIMARY KEY ("idWord") ,CONSTRAINT "tb_words_pk" UNIQUE ("idWord"));CREATE INDEX "tb_words_index" ON "tb_words" ("word" ASC);COMMENT ON COLUMN "tb_words"."idWord" IS '单词id,主键';COMMENT ON COLUMN "tb_words"."idUser" IS '用户id，外键';COMMENT ON COLUMN "tb_words"."word" IS '单词或词组';COMMENT ON COLUMN "tb_words"."phonetic" IS '音标';COMMENT ON COLUMN "tb_words"."pronounce" IS '单词发音数据';COMMENT ON COLUMN "tb_words"."timeCreated" IS '创建时间';COMMENT ON COLUMN "tb_words"."timeUpdated" IS '更新时间';CREATE TABLE "tb_wordInfo" ("idInfo" varchar(64) NOT NULL,"idWord" varchar(64) NOT NULL,"shortcut" varchar(1024) DEFAULT NULL::character varying,"details" text,"examples" text,"timeCreated" timestamp(6) DEFAULT NULL,"timeUpdated" timestamp(6) DEFAULT NULL,CONSTRAINT "tb_wordInfo_pk" PRIMARY KEY ("idInfo") ,CONSTRAINT "tb_wordInfo_pk" UNIQUE ("idInfo"));COMMENT ON COLUMN "tb_wordInfo"."idInfo" IS '详细id，主键';COMMENT ON COLUMN "tb_wordInfo"."idWord" IS '单词id，外键';COMMENT ON COLUMN "tb_wordInfo"."shortcut" IS '简短注释';COMMENT ON COLUMN "tb_wordInfo"."details" IS '详细说明，如例句等';COMMENT ON COLUMN "tb_wordInfo"."examples" IS '例子';COMMENT ON COLUMN "tb_wordInfo"."timeCreated" IS '创建时间';COMMENT ON COLUMN "tb_wordInfo"."timeUpdated" IS '更新时间';CREATE TABLE "tb_userInfo" ("idInfo" varchar(64) NOT NULL,"idUser" varchar(64),"timeUpdate" timestamp,PRIMARY KEY ("idInfo") ,CONSTRAINT "tb_userInfo_pk" UNIQUE ("idInfo"));ALTER TABLE "tb_articles" ADD CONSTRAINT "tb_articles_fk" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_comments" ADD CONSTRAINT "tb_comments_fk3" FOREIGN KEY ("idSection") REFERENCES "tb_sections" ("idSection");ALTER TABLE "tb_comments" ADD CONSTRAINT "tb_comments_fk2" FOREIGN KEY ("idReply") REFERENCES "tb_comments" ("idComment");ALTER TABLE "tb_comments" ADD CONSTRAINT "tb_comments_fk1" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_fans" ADD CONSTRAINT "tb_fans_fk2" FOREIGN KEY ("userNo") REFERENCES "tb_users" ("userNo");ALTER TABLE "tb_fans" ADD CONSTRAINT "tb_fans_fk1" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_friends" ADD CONSTRAINT "tb_friends_fk1" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_friends" ADD CONSTRAINT "tb_friends_fk2" FOREIGN KEY ("userNo") REFERENCES "tb_users" ("userNo");ALTER TABLE "tb_notes" ADD CONSTRAINT "tb_note_fk" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_says" ADD CONSTRAINT "tb_says_fk2" FOREIGN KEY ("idComment") REFERENCES "tb_says" ("idSay");ALTER TABLE "tb_says" ADD CONSTRAINT "tb_says_fk1" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_says" ADD CONSTRAINT "tb_says_fk3" FOREIGN KEY ("idReply") REFERENCES "tb_says" ("idSay");ALTER TABLE "tb_sections" ADD CONSTRAINT "tb_sections_fk" FOREIGN KEY ("idArticle") REFERENCES "tb_articles" ("idArticle");ALTER TABLE "tb_shares" ADD CONSTRAINT "tb_shares_fk" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_users" ADD CONSTRAINT "tb_users_fk" FOREIGN KEY ("idRole") REFERENCES "tb_roles" ("idRole");ALTER TABLE "tb_words" ADD CONSTRAINT "tb_words_fk" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");ALTER TABLE "tb_wordInfo" ADD CONSTRAINT "tb_wordInfo_fk" FOREIGN KEY ("idWord") REFERENCES "tb_words" ("idWord");ALTER TABLE "tb_userInfo" ADD CONSTRAINT "tb_userInfo_fk" FOREIGN KEY ("idUser") REFERENCES "tb_users" ("idUser");