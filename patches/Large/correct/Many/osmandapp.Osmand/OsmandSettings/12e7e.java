diff --git a/OsmAnd/src/net/osmand/OsmandSettings.java b/OsmAnd/src/net/osmand/OsmandSettings.java
index 44f2022..6249419 100644
--- a/OsmAnd/src/net/osmand/OsmandSettings.java
+++ b/OsmAnd/src/net/osmand/OsmandSettings.java
@@ -479,7 +479,7 @@
 					} catch (IOException e) {
 						Log.d(LogUtil.TAG, "Error reading url " + dir.getName(), e); //$NON-NLS-1$
 					}
-					return new TileSourceManager.TileSourceTemplate(dir.getName(), url);
+					return new TileSourceManager.TileSourceTemplate(dir, dir.getName(), url);
 				}
 			}
 				
