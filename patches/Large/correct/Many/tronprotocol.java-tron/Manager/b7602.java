diff --git a/src/main/java/org/tron/core/db/Manager.java b/src/main/java/org/tron/core/db/Manager.java
index 5f1dc67..8bcdcba 100755
--- a/src/main/java/org/tron/core/db/Manager.java
+++ b/src/main/java/org/tron/core/db/Manager.java
@@ -604,7 +604,7 @@
         WitnessCapsule w = this.witnessStore.get(getScheduledWitness(i).toByteArray());
         w.setTotalMissed(w.getTotalMissed()+1);
         this.witnessStore.put(w.createDbKey(), w);
-        logger.info("{} miss a block",w.getAddress());
+        logger.info("{} miss a block",w.createReadableString());
       }
     }
     this.head = block;
@@ -924,7 +924,7 @@
     }
 
     logger.info("updateSignedWitness. witness address:{}, blockNum:{}, totalProduced:{}",
-        witnessCapsule.getAddress(), block.getNum(), witnessCapsule.getTotalProduced());
+        witnessCapsule.createReadableString(), block.getNum(), witnessCapsule.getTotalProduced());
 
   }
 
