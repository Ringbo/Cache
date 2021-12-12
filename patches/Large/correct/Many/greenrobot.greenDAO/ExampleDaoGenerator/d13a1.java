diff --git a/DaoExampleGenerator/src/de/greenrobot/daogenerator/gentest/ExampleDaoGenerator.java b/DaoExampleGenerator/src/de/greenrobot/daogenerator/gentest/ExampleDaoGenerator.java
index 276d291..7dde5f9 100644
--- a/DaoExampleGenerator/src/de/greenrobot/daogenerator/gentest/ExampleDaoGenerator.java
+++ b/DaoExampleGenerator/src/de/greenrobot/daogenerator/gentest/ExampleDaoGenerator.java
@@ -31,7 +31,7 @@
 public class ExampleDaoGenerator {
 
     public static void main(String[] args) throws Exception {
-        Schema schema = new Schema(3, "de.greenrobot.daoexample");
+        Schema schema = new Schema(1000, "de.greenrobot.daoexample");
 
         addNote(schema);
         addCustomerOrder(schema);
