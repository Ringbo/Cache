diff --git a/demos/pax-britannica/pax-britannica/src/de/swagner/paxbritannica/Ship.java b/demos/pax-britannica/pax-britannica/src/de/swagner/paxbritannica/Ship.java
index 6afec21..d7ce097 100644
--- a/demos/pax-britannica/pax-britannica/src/de/swagner/paxbritannica/Ship.java
+++ b/demos/pax-britannica/pax-britannica/src/de/swagner/paxbritannica/Ship.java
@@ -68,7 +68,7 @@
 		collisionPoints.get(2).set( this.getVertices()[10], this.getVertices()[11]);
 		collisionPoints.get(3).set( this.getVertices()[15], this.getVertices()[16]);
 		
-		collisionCenter.set(collisionPoints.get(2)).scl(0.5f).add(collisionPoints.get(0));
+		collisionCenter.set(collisionPoints.get(0)).add(collisionPoints.get(2)).scl(0.5f);
 
 		velocity.scl( (float) Math.pow(0.97f, delta * 30.f));
 		position.add(velocity.x * delta, velocity.y * delta);
