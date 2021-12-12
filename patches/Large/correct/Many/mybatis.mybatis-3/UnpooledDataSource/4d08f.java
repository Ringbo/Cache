diff --git a/src/main/java/org/apache/ibatis/datasource/unpooled/UnpooledDataSource.java b/src/main/java/org/apache/ibatis/datasource/unpooled/UnpooledDataSource.java
index d73a8b5..ad3dbd8 100644
--- a/src/main/java/org/apache/ibatis/datasource/unpooled/UnpooledDataSource.java
+++ b/src/main/java/org/apache/ibatis/datasource/unpooled/UnpooledDataSource.java
@@ -37,7 +37,7 @@
   private String username;
   private String password;
 
-  private boolean autoCommit;
+  private Boolean autoCommit;
   private Integer defaultTransactionIsolationLevel;
 
   static {
@@ -148,11 +148,11 @@
     this.password = password;
   }
 
-  public boolean isAutoCommit() {
+  public Boolean isAutoCommit() {
     return autoCommit;
   }
 
-  public void setAutoCommit(boolean autoCommit) {
+  public void setAutoCommit(Boolean autoCommit) {
     this.autoCommit = autoCommit;
   }
 
@@ -198,7 +198,7 @@
   }
 
   private void configureConnection(Connection conn) throws SQLException {
-    if (autoCommit != conn.getAutoCommit()) {
+    if (autoCommit != null && autoCommit != conn.getAutoCommit()) {
       conn.setAutoCommit(autoCommit);
     }
     if (defaultTransactionIsolationLevel != null) {
