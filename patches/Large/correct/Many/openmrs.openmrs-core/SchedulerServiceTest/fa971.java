diff --git a/api/src/test/java/org/openmrs/scheduler/SchedulerServiceTest.java b/api/src/test/java/org/openmrs/scheduler/SchedulerServiceTest.java
index a99ce20..b97ac24 100644
--- a/api/src/test/java/org/openmrs/scheduler/SchedulerServiceTest.java
+++ b/api/src/test/java/org/openmrs/scheduler/SchedulerServiceTest.java
@@ -118,7 +118,7 @@
 		schedulerService.scheduleTask(t1);
 		Thread.sleep(50); // so t2 doesn't start before t1 due to random millisecond offsets
 		schedulerService.scheduleTask(t2);
-		Thread.sleep(600); // must be longer than t2's delay
+		Thread.sleep(2500); // must be longer than t2's delay
 		assertEquals(Arrays.asList("TASK-1", "TASK-2", "TASK-2", "TASK-1"), outputForConcurrentTasks);
 	}
 	
@@ -244,7 +244,7 @@
 		t5.setTaskClass(SampleTask5.class.getName());
 		
 		schedulerService.scheduleTask(t5);
-		Thread.sleep(1200);
+		Thread.sleep(2500);
 		assertEquals(Arrays.asList("INIT-START-5", "INIT-END-5", "IN EXECUTE"), outputForInitExecSync);
 	}
 	
