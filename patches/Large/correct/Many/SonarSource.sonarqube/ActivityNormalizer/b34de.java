diff --git a/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java b/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java
index 96c2e6e..06c5360 100644
--- a/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java
+++ b/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java
@@ -57,16 +57,16 @@
     public static final IndexField DETAILS = addSearchable(IndexField.Type.OBJECT, "details");
     public static final IndexField MESSAGE = addSearchable(IndexField.Type.STRING, "message");
 
-    public static Set<IndexField> ALL_FIELDS = getAllFields();
+    public static final Set<IndexField> ALL_FIELDS = getAllFields();
 
-    private static Set<IndexField> getAllFields() {
+    private static final Set<IndexField> getAllFields() {
       Set<IndexField> fields = new HashSet<IndexField>();
       for (Field classField : LogFields.class.getDeclaredFields()) {
         if (Modifier.isFinal(classField.getModifiers()) && Modifier.isStatic(classField.getModifiers())) {
           try {
             fields.add(IndexField.class.cast(classField.get(null)));
           } catch (IllegalAccessException e) {
-            e.printStackTrace();
+            throw new IllegalStateException("Could not access Field '" + classField.getName() + "'");
           }
         }
       }
@@ -83,7 +83,7 @@
     DbSession dbSession = db.openSession(false);
     List<UpdateRequest> requests = new ArrayList<UpdateRequest>();
     try {
-      requests.addAll(normalize(db.activityDao().getNullableByKey(dbSession, activityKey)));
+      requests.addAll(normalize(db.activityDao().getByKey(dbSession, activityKey)));
     } finally {
       dbSession.close();
     }
