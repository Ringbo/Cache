diff --git a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/AsynchonousPartialSorterITCase.java b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/AsynchonousPartialSorterITCase.java
index cafd24b..ec2fd60 100644
--- a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/AsynchonousPartialSorterITCase.java
+++ b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/sort/AsynchonousPartialSorterITCase.java
@@ -134,7 +134,7 @@
 			// merge iterator
 			LOG.debug("Initializing sortmerger...");
 			Sorter<PactRecord> sorter = new AsynchronousPartialSorter<PactRecord>(this.memoryManager, source,
-				this.parentTask, this.serializer, this.comparator, 32 * 1024 * 1024);
+				this.parentTask, this.serializer, this.comparator, 10 * 1024 * 1024);
 	
 			runPartialSorter(sorter, NUM_RECORDS, 2);
 		}
@@ -157,9 +157,9 @@
 			// merge iterator
 			LOG.debug("Initializing sortmerger...");
 			Sorter<PactRecord> sorter = new AsynchronousPartialSorter<PactRecord>(this.memoryManager, source,
-				this.parentTask, this.serializer, this.comparator, 32 * 1024 * 1024);
+				this.parentTask, this.serializer, this.comparator, 10 * 1024 * 1024);
 	
-			runPartialSorter(sorter, NUM_RECORDS, 28);
+			runPartialSorter(sorter, NUM_RECORDS, 25);
 		}
 		catch (Exception t) {
 			t.printStackTrace();
