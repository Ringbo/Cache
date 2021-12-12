diff --git a/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/jobmanager/JobManager.java b/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/jobmanager/JobManager.java
index 207fc6c..81adea0 100644
--- a/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/jobmanager/JobManager.java
+++ b/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/jobmanager/JobManager.java
@@ -503,7 +503,7 @@
 
 		// Try to create initial execution graph from job graph
 		LOG.info("Creating initial execution graph from job graph " + job.getName());
-		ExecutionGraph eg = null;
+		ExecutionGraph eg;
 
 		try {
 			eg = new ExecutionGraph(job, this.instanceManager);
@@ -589,7 +589,7 @@
 			LibraryCacheManager.unregister(executionGraph.getJobID());
 		} catch (IOException ioe) {
 			if (LOG.isWarnEnabled()) {
-				LOG.warn(StringUtils.stringifyException(ioe));
+				LOG.warn(ioe);
 			}
 		}
 	}
@@ -959,7 +959,7 @@
 				try {
 					instance.killTaskManager();
 				} catch (IOException ioe) {
-					LOG.error(StringUtils.stringifyException(ioe));
+					LOG.error(ioe);
 				}
 			}
 		};
@@ -1052,7 +1052,7 @@
 						it2.next().logBufferUtilization();
 					}
 				} catch (IOException ioe) {
-					LOG.error(StringUtils.stringifyException(ioe));
+					LOG.error(ioe);
 				}
 
 			}
@@ -1187,9 +1187,9 @@
 			server = new WebInfoServer(config, port, this);
 			server.start();
 		} catch (FileNotFoundException e) {
-			LOG.error(e.getMessage());
+			LOG.error(e.getMessage(), e);
 		} catch (Exception e) {
-			LOG.error("Cannot instantiate info server: " + StringUtils.stringifyException(e));
+			LOG.error("Cannot instantiate info server: " + e.getMessage(), e);
 		}
 	}
 	
