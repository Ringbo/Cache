diff --git a/modules/apps/foundation/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/order/OrderUtil.java b/modules/apps/foundation/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/order/OrderUtil.java
index d9a2dbe..92f4ff2 100644
--- a/modules/apps/foundation/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/order/OrderUtil.java
+++ b/modules/apps/foundation/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/order/OrderUtil.java
@@ -91,7 +91,7 @@
 	}
 
 	private static String[] _appendAndSort(String[]... groups) {
-		HashMap<String, Integer> map = new HashMap<>();
+		Map<String, Integer> map = new HashMap<>();
 
 		if (groups[0] != null) {
 			if (Arrays.binarySearch(groups[0], Order.OTHERS) >= 0) {
@@ -107,9 +107,9 @@
 			}
 		}
 
-		Set<String> keySet = map.keySet();
+		Set<String> set = map.keySet();
 
-		String[] orderedNames = keySet.toArray(new String[keySet.size()]);
+		String[] orderedNames = set.toArray(new String[set.size()]);
 
 		Arrays.sort(orderedNames);
 
