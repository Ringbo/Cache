diff --git a/src/test/java/com/fasterxml/jackson/databind/mixins/TestMixinDeserForClass.java b/src/test/java/com/fasterxml/jackson/databind/mixins/TestMixinDeserForClass.java
index aae725d..91cb954 100644
--- a/src/test/java/com/fasterxml/jackson/databind/mixins/TestMixinDeserForClass.java
+++ b/src/test/java/com/fasterxml/jackson/databind/mixins/TestMixinDeserForClass.java
@@ -28,11 +28,11 @@
         public void setA(String v) { a = "XXX"+v; }
     }
 
-    @JsonAutoDetect(getterVisibility=Visibility.ANY, fieldVisibility=Visibility.ANY)
+    @JsonAutoDetect(setterVisibility=Visibility.ANY, fieldVisibility=Visibility.ANY)
     static class LeafClass
         extends BaseClass { }
 
-    @JsonAutoDetect(getterVisibility=Visibility.NONE, fieldVisibility=Visibility.NONE)
+    @JsonAutoDetect(setterVisibility=Visibility.NONE, fieldVisibility=Visibility.NONE)
     interface MixIn { }
 
     /*
