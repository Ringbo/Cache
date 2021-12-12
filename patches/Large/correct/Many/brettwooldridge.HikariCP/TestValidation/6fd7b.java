diff --git a/hikaricp-common/src/test/java/com/zaxxer/hikari/TestValidation.java b/hikaricp-common/src/test/java/com/zaxxer/hikari/TestValidation.java
index e92ad1a..0924a11 100644
--- a/hikaricp-common/src/test/java/com/zaxxer/hikari/TestValidation.java
+++ b/hikaricp-common/src/test/java/com/zaxxer/hikari/TestValidation.java
@@ -170,9 +170,9 @@
 
       HikariConfig config = new HikariConfig();
       config.setDataSourceClassName("com.zaxxer.hikari.mocks.StubDataSource");
-      config.setIdleTimeout(TimeUnit.SECONDS.toMillis(25));
+      config.setIdleTimeout(TimeUnit.SECONDS.toMillis(5));
       config.validate();
-      Assert.assertTrue(new String(baos.toByteArray()).contains("less than 30000ms"));
+      Assert.assertTrue(new String(baos.toByteArray()).contains("less than 10000ms"));
    }
 
    @Test
