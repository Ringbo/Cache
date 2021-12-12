diff --git a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java
index cde10fe..c16fcad 100644
--- a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java
+++ b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonJobDelegate.java
@@ -90,7 +90,7 @@
 				if (JobMeta.STRING_SPECIAL_START.equals(type_desc)
 						|| JobMeta.STRING_SPECIAL_DUMMY.equals(type_desc))
 				{
-					jobPlugin = jobLoader.findJobEntriesWithDescription(JobMeta.STRING_SPECIAL);
+					jobPlugin = jobLoader.findJobEntriesWithID(JobMeta.STRING_SPECIAL);					
 				}
 			}
 
