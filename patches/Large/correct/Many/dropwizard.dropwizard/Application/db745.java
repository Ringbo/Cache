diff --git a/dropwizard-core/src/main/java/io/dropwizard/Application.java b/dropwizard-core/src/main/java/io/dropwizard/Application.java
index 98b7390..2c74668 100644
--- a/dropwizard-core/src/main/java/io/dropwizard/Application.java
+++ b/dropwizard-core/src/main/java/io/dropwizard/Application.java
@@ -64,7 +64,7 @@
      * @param arguments the command-line arguments
      * @throws Exception if something goes wrong
      */
-    public final void run(String... arguments) throws Exception {
+    public void run(String... arguments) throws Exception {
         final Bootstrap<T> bootstrap = new Bootstrap<>(this);
         bootstrap.addCommand(new ServerCommand<>(this));
         bootstrap.addCommand(new CheckCommand<>(this));
