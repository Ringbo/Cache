diff --git a/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/JavaTypeProfile.java b/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/JavaTypeProfile.java
index 542b95c..f891b46 100644
--- a/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/JavaTypeProfile.java
+++ b/graal/com.oracle.graal.api.meta/src/com/oracle/graal/api/meta/JavaTypeProfile.java
@@ -116,7 +116,7 @@
             probabilitySum += newNotRecorded;
 
             double factor = 1.0 / probabilitySum; // Normalize to 1.0
-            assert factor > 1.0;
+            assert factor >= 1.0;
             ProfiledType[] newResult = new ProfiledType[result.size()];
             for (int i = 0; i < newResult.length; ++i) {
                 ProfiledType curType = result.get(i);
