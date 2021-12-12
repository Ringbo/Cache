diff --git a/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nfa/NFAState.java b/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nfa/NFAState.java
index 2d35b4f..2f7377d 100644
--- a/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nfa/NFAState.java
+++ b/regex/src/com.oracle.truffle.regex/src/com/oracle/truffle/regex/tregex/nfa/NFAState.java
@@ -364,7 +364,7 @@
                         Json.prop("reverseAnchoredFinalState", isReverseAnchoredFinalState()),
                         Json.prop("reverseUnAnchoredFinalState", isReverseUnAnchoredFinalState()),
                         Json.prop("next", next.stream().map(x -> Json.val(x.getId()))),
-                        Json.prop("prev", next.stream().map(x -> Json.val(x.getId()))));
+                        Json.prop("prev", prev.stream().map(x -> Json.val(x.getId()))));
     }
 
     @TruffleBoundary
