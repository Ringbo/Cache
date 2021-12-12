diff --git a/querydsl-core/src/test/java/com/mysema/query/codegen/BeanSerializerTest.java b/querydsl-core/src/test/java/com/mysema/query/codegen/BeanSerializerTest.java
index 7be9cf3..872a2c1 100644
--- a/querydsl-core/src/test/java/com/mysema/query/codegen/BeanSerializerTest.java
+++ b/querydsl-core/src/test/java/com/mysema/query/codegen/BeanSerializerTest.java
@@ -31,7 +31,7 @@
     
     private EntityType type;
 
-    private Writer writer = new StringWriter();
+    private final Writer writer = new StringWriter();
 
     @Before
     public void setUp(){
@@ -112,7 +112,7 @@
         System.err.println(str);
         for (String prop : Arrays.asList(
                 "String[] arrayField;",
-                "Boolean boolean_;",
+                "Boolean boolean$;",
                 "java.util.Collection<DomainClass> collection;",
                 "Comparable comparable;",
                 "java.util.Date date;",
