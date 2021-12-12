diff --git a/src/org/nutz/json/Json.java b/src/org/nutz/json/Json.java
index 1ce1a7a..55a8ae6 100644
--- a/src/org/nutz/json/Json.java
+++ b/src/org/nutz/json/Json.java
@@ -257,16 +257,17 @@
     /**
      * 保存所有的 Json 实体
      */
-    private static final ConcurrentHashMap<String, JsonEntity> entities = new ConcurrentHashMap<String, JsonEntity>();
+    @SuppressWarnings("rawtypes")
+	private static final ConcurrentHashMap<Class, JsonEntity> entities = new ConcurrentHashMap<Class, JsonEntity>();
 
     /**
      * 获取一个 Json 实体
      */
     public static JsonEntity getEntity(Mirror<?> mirror) {
-        JsonEntity je = entities.get(mirror.getTypeId());
+        JsonEntity je = entities.get(mirror.getType());
         if (null == je) {
             je = new JsonEntity(mirror);
-            entities.put(mirror.getTypeId(), je);
+            entities.put(mirror.getType(), je);
         }
         return je;
     }
