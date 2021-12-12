diff --git a/jta/tx-exception/src/test/java/org/javaee7/jta/tx/exception/EmployeeBeanTest.java b/jta/tx-exception/src/test/java/org/javaee7/jta/tx/exception/EmployeeBeanTest.java
index 6d38429..ca1757e 100644
--- a/jta/tx-exception/src/test/java/org/javaee7/jta/tx/exception/EmployeeBeanTest.java
+++ b/jta/tx-exception/src/test/java/org/javaee7/jta/tx/exception/EmployeeBeanTest.java
@@ -24,7 +24,7 @@
     public static Archive<?> deploy() {
         return ShrinkWrap.create(JavaArchive.class)
                 .addClasses(EmployeeBean.class, Employee.class)
-                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
+                .addAsManifestResource("beans.xml")
                 .addAsResource("META-INF/persistence.xml")
                 .addAsResource("META-INF/create.sql")
                 .addAsResource("META-INF/load.sql")
