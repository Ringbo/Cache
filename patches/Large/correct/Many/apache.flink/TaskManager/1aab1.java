diff --git a/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/taskmanager/TaskManager.java b/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/taskmanager/TaskManager.java
index 4313755..a31a832 100644
--- a/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/taskmanager/TaskManager.java
+++ b/stratosphere-runtime/src/main/java/eu/stratosphere/nephele/taskmanager/TaskManager.java
@@ -615,7 +615,7 @@
 				final TaskSubmissionResult result = new TaskSubmissionResult(vertexID,
 					AbstractTaskResult.ReturnCode.DEPLOYMENT_ERROR);
 				result.setDescription(StringUtils.stringifyException(t));
-				LOG.error(result.getDescription());
+				LOG.error(result.getDescription(), t);
 				submissionResultList.add(result);
 				continue;
 			}
@@ -632,7 +632,7 @@
 				final TaskSubmissionResult result = new TaskSubmissionResult(vertexID,
 					AbstractTaskResult.ReturnCode.INSUFFICIENT_RESOURCES);
 				result.setDescription(e.getMessage());
-				LOG.error(result.getDescription());
+				LOG.error(result.getDescription(), e);
 				submissionResultList.add(result);
 				continue;
 			}
@@ -667,8 +667,6 @@
 	 *        the job configuration that has been attached to the original job graph
 	 * @param environment
 	 *        the environment of the task to be registered
-	 * @param initialCheckpointState
-	 *        the task's initial checkpoint state
 	 * @param activeOutputChannels
 	 *        the set of initially active output channels
 	 * @return the task to be started or <code>null</code> if a task with the same ID was already running
@@ -686,7 +684,7 @@
 		}
 
 		// Task creation and registration must be atomic
-		Task task = null;
+		Task task;
 
 		synchronized (this) {
 			final Task runningTask = this.runningTasks.get(id);
@@ -810,7 +808,7 @@
 				this.jobManager.updateTaskExecutionState(new TaskExecutionState(jobID, id, newExecutionState,
 					optionalDescription));
 			} catch (IOException e) {
-				LOG.error(StringUtils.stringifyException(e));
+				LOG.error(e);
 			}
 		}
 	}
@@ -867,7 +865,7 @@
 				this.executorService.awaitTermination(5000L, TimeUnit.MILLISECONDS);
 			} catch (InterruptedException e) {
 				if (LOG.isDebugEnabled()) {
-					LOG.debug(StringUtils.stringifyException(e));
+					LOG.debug(e);
 				}
 			}
 		}
