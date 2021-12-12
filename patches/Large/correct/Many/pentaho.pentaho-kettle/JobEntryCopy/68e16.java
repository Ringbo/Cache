diff --git a/src/org/pentaho/di/job/entry/JobEntryCopy.java b/src/org/pentaho/di/job/entry/JobEntryCopy.java
index 43ae945..259bac4 100644
--- a/src/org/pentaho/di/job/entry/JobEntryCopy.java
+++ b/src/org/pentaho/di/job/entry/JobEntryCopy.java
@@ -122,7 +122,7 @@
 				int y = Const.toInt(XMLHandler.getTagValue(entrynode, "yloc"), 0);
 				setLocation(x, y);
 			}
-		} catch (Exception e)
+		} catch (Throwable e)
 		{
 			String message = "Unable to read Job Entry copy info from XML node : " + e.toString();
 			LogWriter log = LogWriter.getInstance();
