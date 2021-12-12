diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/prelert/job/persistence/JobProvider.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/prelert/job/persistence/JobProvider.java
index 13dfe9e2..42b0336 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/prelert/job/persistence/JobProvider.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/prelert/job/persistence/JobProvider.java
@@ -149,7 +149,7 @@
                         }
                     });
 
-        } catch (IOException e) {
+        } catch (Exception e) {
             LOGGER.warn("Error creating the usage metering index", e);
         }
     }
@@ -299,7 +299,7 @@
                 }
             });
         } catch (Exception e) {
-            LOGGER.warn("Error creating the usage metering index", e);
+            LOGGER.error("Error creating the " + AnomalyDetectorsIndex.jobStateIndexName() + " index", e);
         }
     }
 
