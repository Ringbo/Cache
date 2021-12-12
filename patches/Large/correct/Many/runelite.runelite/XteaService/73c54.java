diff --git a/http-service/src/main/java/net/runelite/http/service/xtea/XteaService.java b/http-service/src/main/java/net/runelite/http/service/xtea/XteaService.java
index 60dd91a..ddc476a 100644
--- a/http-service/src/main/java/net/runelite/http/service/xtea/XteaService.java
+++ b/http-service/src/main/java/net/runelite/http/service/xtea/XteaService.java
@@ -150,7 +150,7 @@
 			}
 
 			query.executeBatch();
-			con.commit();
+			con.commit(false);
 		}
 	}
 
