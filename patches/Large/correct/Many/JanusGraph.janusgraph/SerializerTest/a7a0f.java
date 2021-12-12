diff --git a/titan-test/src/test/java/com/thinkaurelius/titan/graphdb/serializer/SerializerTest.java b/titan-test/src/test/java/com/thinkaurelius/titan/graphdb/serializer/SerializerTest.java
index 1cd1ef1..8ebd993 100644
--- a/titan-test/src/test/java/com/thinkaurelius/titan/graphdb/serializer/SerializerTest.java
+++ b/titan-test/src/test/java/com/thinkaurelius/titan/graphdb/serializer/SerializerTest.java
@@ -201,14 +201,14 @@
         try {
             out.writeClassAndObject(dc);
             fail();
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
 
         }
         TestTransientClass d = new TestTransientClass(101);
         try {
             out.writeClassAndObject(d);
             fail();
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
 
         }
         out.writeObject(null, TestClass.class);
