diff --git a/sdks/java/extensions/euphoria/euphoria-fluent/src/main/java/cz/seznam/euphoria/fluent/Dataset.java b/sdks/java/extensions/euphoria/euphoria-fluent/src/main/java/cz/seznam/euphoria/fluent/Dataset.java
index 4cb3143..e92f79c 100644
--- a/sdks/java/extensions/euphoria/euphoria-fluent/src/main/java/cz/seznam/euphoria/fluent/Dataset.java
+++ b/sdks/java/extensions/euphoria/euphoria-fluent/src/main/java/cz/seznam/euphoria/fluent/Dataset.java
@@ -73,7 +73,7 @@
     return this;
   }
 
-  public void execute(Executor exec) {
+  public void execute(Executor exec) throws Exception {
     exec.waitForCompletion(this.wrap.getFlow());
   }
 }
