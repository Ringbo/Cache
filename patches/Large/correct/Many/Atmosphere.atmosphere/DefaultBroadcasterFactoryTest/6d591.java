diff --git a/modules/cpr/src/test/java/org/atmosphere/cpr/DefaultBroadcasterFactoryTest.java b/modules/cpr/src/test/java/org/atmosphere/cpr/DefaultBroadcasterFactoryTest.java
index dacb3c7..153b86a 100644
--- a/modules/cpr/src/test/java/org/atmosphere/cpr/DefaultBroadcasterFactoryTest.java
+++ b/modules/cpr/src/test/java/org/atmosphere/cpr/DefaultBroadcasterFactoryTest.java
@@ -88,7 +88,7 @@
     public void testLookup_Class_Object() {
         String id = "id";
         String id2 = "foo";
-        assert factory.lookup(DefaultBroadcaster.class, id) != null;
+        assert factory.lookup(DefaultBroadcaster.class, id, true) != null;
         assert factory.lookup(DefaultBroadcaster.class, id2) == null;
     }
 
