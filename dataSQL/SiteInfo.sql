CREATE TABLE "tb_siteNavigation" (

"idNavigation" varchar(64) NOT NULL,

"navigationName" varchar(512) NOT NULL,

"url" varchar(2048) DEFAULT NULL,

"flag" bool DEFAULT true,

"timeCreated" timestamp(6) DEFAULT NULL,

"timeUpdated" timestamp(6) DEFAULT NULL,

CONSTRAINT "tb_siteNavigation_pk" PRIMARY KEY ("idNavigation") ,

CONSTRAINT "tb_siteNavigation_pk" UNIQUE ("idNavigation")

);
