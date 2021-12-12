diff --git a/src_eclipseagent/lombok/eclipse/agent/EclipsePatcher.java b/src_eclipseagent/lombok/eclipse/agent/EclipsePatcher.java
index d51729f..7011caa 100644
--- a/src_eclipseagent/lombok/eclipse/agent/EclipsePatcher.java
+++ b/src_eclipseagent/lombok/eclipse/agent/EclipsePatcher.java
@@ -90,7 +90,7 @@
 		instrumentation.addTransformer(new Patcher(), true);
 		
 		if ( transformExisting ) for ( Class<?> c : instrumentation.getAllLoadedClasses() ) {
-			if ( c.getName().equals(ECLIPSE_PARSER_CLASS_NAME) ) {
+			if ( c.getName().equals(ECLIPSE_PARSER_CLASS_NAME) || c.getName().equals(ECLIPSE_CUD_CLASS_NAME) ) {
 				try {
 					instrumentation.retransformClasses(c);
 				} catch ( UnmodifiableClassException ex ) {
