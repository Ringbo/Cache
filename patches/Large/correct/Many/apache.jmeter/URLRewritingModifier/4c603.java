diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/modifier/URLRewritingModifier.java b/src/protocol/http/org/apache/jmeter/protocol/http/modifier/URLRewritingModifier.java
index b05e61f..dab3b56 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/modifier/URLRewritingModifier.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/modifier/URLRewritingModifier.java
@@ -123,7 +123,7 @@
 			}
 		} else {
 			sampler.getArguments().removeArgument(getArgumentName());
-			sampler.getArguments().addArgument(new HTTPArgument(getArgumentName(), value, false));
+			sampler.getArguments().addArgument(new HTTPArgument(getArgumentName(), value, true));
 		}
 	}
 
