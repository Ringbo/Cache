diff --git a/http-service/src/main/java/net/runelite/http/service/item/ItemService.java b/http-service/src/main/java/net/runelite/http/service/item/ItemService.java
index 36f138c..ff2fdbd 100644
--- a/http-service/src/main/java/net/runelite/http/service/item/ItemService.java
+++ b/http-service/src/main/java/net/runelite/http/service/item/ItemService.java
@@ -244,7 +244,7 @@
 			}
 
 			query.executeBatch();
-			con.commit();
+			con.commit(false);
 
 			return entries;
 		}
@@ -320,7 +320,7 @@
 			}
 
 			q.executeBatch();
-			con.commit();
+			con.commit(false);
 		}
 	}
 
