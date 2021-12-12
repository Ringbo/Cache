diff --git a/main/src/com/google/refine/operations/recon/ReconMatchSpecificTopicOperation.java b/main/src/com/google/refine/operations/recon/ReconMatchSpecificTopicOperation.java
index 094056c..6a509b0 100644
--- a/main/src/com/google/refine/operations/recon/ReconMatchSpecificTopicOperation.java
+++ b/main/src/com/google/refine/operations/recon/ReconMatchSpecificTopicOperation.java
@@ -68,7 +68,7 @@
         
         JSONObject match = obj.getJSONObject("match");
         
-        JSONArray types = obj.getJSONArray("types");
+        JSONArray types = match.getJSONArray("types");
         String[] typeIDs = new String[types.length()];
         for (int i = 0; i < typeIDs.length; i++) {
             typeIDs[i] = types.getString(i);
