diff --git a/common/buildcraft/core/Version.java b/common/buildcraft/core/Version.java
index b81346d..194f302 100644
--- a/common/buildcraft/core/Version.java
+++ b/common/buildcraft/core/Version.java
@@ -47,7 +47,7 @@
 		property.comment = "indicates the last version the user has been informed about and will suppress further notices on it.";
 		String seenVersion = property.value;
 
-		if (recommendedVersion.equals(seenVersion))
+		if (recommendedVersion == null || recommendedVersion.equals(seenVersion))
 			return false;
 
 		property.value = recommendedVersion;
