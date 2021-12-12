diff --git a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java
index 073164ca..78c9a0f 100644
--- a/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java
+++ b/pact/pact-compiler/src/main/java/eu/stratosphere/pact/compiler/plan/MatchNode.java
@@ -142,7 +142,7 @@
 			case SORT_BOTH_MERGE:      return 2;
 			case SORT_FIRST_MERGE:     return 1;
 			case SORT_SECOND_MERGE:    return 1;
-			case MERGE:                return 0;
+			case MERGE:                return 1;
 			case HYBRIDHASH_FIRST:     return 1;
 			case HYBRIDHASH_SECOND:    return 1;
 			case MMHASH_FIRST:         return 1;
