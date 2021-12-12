diff --git a/bundles/core/org.openhab.core.compat1x/src/main/java/org/openhab/library/tel/types/ESHCallType.java b/bundles/core/org.openhab.core.compat1x/src/main/java/org/openhab/library/tel/types/ESHCallType.java
index 82cde3a..1a3744a 100644
--- a/bundles/core/org.openhab.core.compat1x/src/main/java/org/openhab/library/tel/types/ESHCallType.java
+++ b/bundles/core/org.openhab.core.compat1x/src/main/java/org/openhab/library/tel/types/ESHCallType.java
@@ -85,7 +85,7 @@
 		return String.format(pattern, callDetails.values().toArray());
 	}
 	
-	public ESHCallType valueOf(String value) {
+	public static ESHCallType valueOf(String value) {
 		return new ESHCallType(value);
 	}
 	
