diff --git a/portal-impl/src/com/liferay/portal/util/HttpImpl.java b/portal-impl/src/com/liferay/portal/util/HttpImpl.java
index 5bb02ab..1e58db8 100644
--- a/portal-impl/src/com/liferay/portal/util/HttpImpl.java
+++ b/portal-impl/src/com/liferay/portal/util/HttpImpl.java
@@ -754,7 +754,7 @@
 							_log.info(
 								"Skipping parameter with key " + key +
 									" because of invalid value " + kvp[1],
-								e);
+								iae);
 						}
 
 						continue;
@@ -1106,7 +1106,7 @@
 				catch (IllegalArgumentException iae) {
 					if (_log.isDebugEnabled()) {
 						_log.debug(
-							"Skipping undecodable parameter " + param, e);
+							"Skipping undecodable parameter " + param, iae);
 					}
 
 					continue;
