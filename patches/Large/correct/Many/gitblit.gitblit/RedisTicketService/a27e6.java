diff --git a/src/main/java/com/gitblit/tickets/RedisTicketService.java b/src/main/java/com/gitblit/tickets/RedisTicketService.java
index bc639da..58f7243 100644
--- a/src/main/java/com/gitblit/tickets/RedisTicketService.java
+++ b/src/main/java/com/gitblit/tickets/RedisTicketService.java
@@ -168,7 +168,7 @@
 		}
 		try {
 			Boolean exists = jedis.exists(key(repository, KeyType.journal, ticketId));
-			return exists != null && !exists;
+			return exists != null && exists;
 		} catch (JedisException e) {
 			log.error("failed to check hasTicket from Redis @ " + getUrl(), e);
 			pool.returnBrokenResource(jedis);
