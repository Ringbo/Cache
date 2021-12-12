diff --git a/src/main/java/com/google/devtools/build/lib/bazel/repository/GitCloner.java b/src/main/java/com/google/devtools/build/lib/bazel/repository/GitCloner.java
index af7fa58..49126f9 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/repository/GitCloner.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/repository/GitCloner.java
@@ -181,7 +181,7 @@
       Throwable throwable = e;
       while (throwable.getCause() != null) {
         throwable = throwable.getCause();
-        errmsg.append(" caused by " + e.getMessage());
+        errmsg.append(" caused by " + throwable.getMessage());
       }
       throw new RepositoryFunctionException(
           new IOException("Error cloning repository: " + errmsg), Transience.PERSISTENT);
