diff --git a/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java b/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java
index e4360b5..005ac5f 100644
--- a/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java
+++ b/api/src/main/java/org/openmrs/util/OpenmrsClassLoader.java
@@ -563,7 +563,7 @@
 									}
 								}
 							}
-							catch (Throwable t) {
+							catch (Exception t) {
 								if (log.isDebugEnabled()) {
 									log.debug("Could not set field " + field.getName() + " to null in class "
 									        + clazz.getName(), t);
@@ -572,7 +572,7 @@
 						}
 					}
 				}
-				catch (Throwable t) {
+				catch (Exception t) {
 					if (log.isDebugEnabled()) {
 						log.debug("Could not clean fields for class " + clazz.getName(), t);
 					}
@@ -665,7 +665,7 @@
 			if (!Context.isRefreshingContext())
 				mementos.put(key, Context.getSchedulerService().saveToMemento());
 		}
-		catch (Throwable t) {
+		catch (Exception t) {
 			// pass
 		}
 	}
