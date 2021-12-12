diff --git a/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java b/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java
index c7b79bb..4368267 100644
--- a/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java
+++ b/elasticsearch/x-pack/license-plugin/src/main/java/org/elasticsearch/license/plugin/core/LicensesService.java
@@ -149,7 +149,7 @@
     }
 
     private void populateExpirationCallbacks() {
-        expirationCallbacks.add(new ExpirationCallback.Pre(days(7), days(30), days(1)) {
+        expirationCallbacks.add(new ExpirationCallback.Pre(days(7), days(25), days(1)) {
                                     @Override
                                     public void on(License license) {
                                         String general = LoggerMessageFormat.format(null, "\n" +
@@ -174,9 +174,9 @@
                                                     }
                                                 }
                                             }
-                                            logger.error("{}", builder);
+                                            logger.warn("{}", builder);
                                         } else {
-                                            logger.error("{}", general);
+                                            logger.warn("{}", general);
                                         }
                                     }
                                 }
@@ -206,9 +206,9 @@
                                                     }
                                                 }
                                             }
-                                            logger.error("{}", builder.toString());
+                                            logger.warn("{}", builder.toString());
                                         } else {
-                                            logger.error("{}", general);
+                                            logger.warn("{}", general);
                                         }
                                     }
                                 }
@@ -238,9 +238,9 @@
                                                     }
                                                 }
                                             }
-                                            logger.error("{}", builder.toString());
+                                            logger.warn("{}", builder.toString());
                                         } else {
-                                            logger.error("{}", general);
+                                            logger.warn("{}", general);
                                         }
                                     }
                                 }
