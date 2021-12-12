diff --git a/OsmAnd/src/net/osmand/plus/AppInitializer.java b/OsmAnd/src/net/osmand/plus/AppInitializer.java
index 6891bca..7c02ddb 100644
--- a/OsmAnd/src/net/osmand/plus/AppInitializer.java
+++ b/OsmAnd/src/net/osmand/plus/AppInitializer.java
@@ -351,7 +351,7 @@
 						Integer in = (Integer) f.get(null);
 						return app.getString(in);
 					}
-				} catch (Exception e) {
+				} catch (Throwable e) {
 					LOG.info("No translation: " + keyName);
 				}
 				return null;
