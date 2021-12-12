diff --git a/src/test/java/reactor/core/publisher/scenarios/ScatterGatherTests.java b/src/test/java/reactor/core/publisher/scenarios/ScatterGatherTests.java
index a54b5d2..c3dffce 100644
--- a/src/test/java/reactor/core/publisher/scenarios/ScatterGatherTests.java
+++ b/src/test/java/reactor/core/publisher/scenarios/ScatterGatherTests.java
@@ -103,9 +103,9 @@
 		}
 		catch(Exception e){
 			e.printStackTrace();
-			Assert.assertTrue(e.getSuppressed()[0].getMessage().contains
+			Assert.assertTrue(e.getSuppressed()[1].getMessage().contains
 					("ScatterGatherTests.java:"));
-			Assert.assertTrue(e.getSuppressed()[0].getMessage().contains("|_\tMono.map" +
+			Assert.assertTrue(e.getSuppressed()[1].getMessage().contains("|_\tMono.map" +
 					"(ScatterGatherTests.java:"));
 			return;
 		}
