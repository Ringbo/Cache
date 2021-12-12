diff --git a/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java b/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java
index 9dd7a93..87bbced 100644
--- a/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java
+++ b/web/src/main/java/org/openmrs/web/filter/update/UpdateFilter.java
@@ -380,7 +380,7 @@
 					}
 				}
 			}
-			catch (Throwable t2) {
+			catch (Exception t2) {
 				log.error("Error while trying to authenticate as super user (voided version)", e);
 			}
 		}
