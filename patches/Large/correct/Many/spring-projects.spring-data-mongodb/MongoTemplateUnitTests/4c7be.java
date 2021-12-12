diff --git a/spring-data-mongodb/src/test/java/org/springframework/data/mongodb/core/MongoTemplateUnitTests.java b/spring-data-mongodb/src/test/java/org/springframework/data/mongodb/core/MongoTemplateUnitTests.java
index 2d04c28..f1024ad 100644
--- a/spring-data-mongodb/src/test/java/org/springframework/data/mongodb/core/MongoTemplateUnitTests.java
+++ b/spring-data-mongodb/src/test/java/org/springframework/data/mongodb/core/MongoTemplateUnitTests.java
@@ -235,7 +235,7 @@
 				org.mockito.Matchers.isNull(DBObject.class), org.mockito.Matchers.isNull(DBObject.class), eq(false),
 				captor.capture(), eq(false), eq(false));
 
-		Assert.assertThat(captor.getValue().get("$inc"), Is.<Object> is(new BasicDBObject("version", 1)));
+		Assert.assertThat(captor.getValue().get("$inc"), Is.<Object> is(new BasicDBObject("version", 1L)));
 	}
 
 	/**
