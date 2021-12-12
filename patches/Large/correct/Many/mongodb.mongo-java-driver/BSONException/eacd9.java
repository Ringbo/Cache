diff --git a/src/main/org/bson/BSONException.java b/src/main/org/bson/BSONException.java
index af5693a..71fc513 100644
--- a/src/main/org/bson/BSONException.java
+++ b/src/main/org/bson/BSONException.java
@@ -34,7 +34,7 @@
      * @param errorCode The error code.
      * @param msg The error message.
      */
-    public BSONException( final String errorCode, final String msg ) {
+    public BSONException( final int errorCode, final String msg ) {
         super( msg );
         _errorCode = errorCode;
     }
@@ -52,7 +52,7 @@
      * @param msg The error message.
      * @param t The throwable cause.
      */
-    public BSONException( final String errorCode, final String msg, final Throwable t ) {
+    public BSONException( final int errorCode, final String msg, final Throwable t ) {
         super( msg,  t );
         _errorCode = errorCode;
     }
@@ -61,7 +61,7 @@
      * Returns the error code.
      * @return The error code.
      */
-    public String getErrorCode() { return _errorCode; }
+    public Integer getErrorCode() { return _errorCode; }
 
     /**
      * Returns true if the error code is set (i.e., not null).
@@ -70,6 +70,6 @@
         return (_errorCode != null) ? true : false; 
     }
 
-    private String _errorCode = null;
+    private Integer _errorCode = null;
 }
 
