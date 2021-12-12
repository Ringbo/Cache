diff --git a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java
index 4026f62..02d50e2 100644
--- a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java
+++ b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java
@@ -804,7 +804,7 @@
 			gp1 = new GlobalProperties();
 		}
 
-		if(preds2.size() == 1) {
+		if(preds2 != null && preds2.size() == 1) {
 			gp2 = PactConnection.getGlobalPropertiesAfterConnection(preds2.get(0), this, ss2);
 		} else {
 			// TODO right now we drop all properties in the union case; need to figure out what properties can be kept
