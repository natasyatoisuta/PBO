class Rekening {
   String namaPemilik;
   String nomorRekening;
   double saldo;

   public Rekening(String var1, String var2, double var3) {
      this.namaPemilik = var1;
      this.nomorRekening = var2;
      this.saldo = var3;
   }

   public void setor(double var1) {
      this.saldo += var1;
      System.out.println("Setor: " + var1 + ",saldo sekarang: " + this.saldo);
   }

   public void tarik(double var1) {
      if (this.saldo >= var1) {
         this.saldo -= var1;
         System.out.println(" Tarik:" + var1 + " , Saldo sekarang:" + this.saldo);
      } else {
         System.out.println(" saldo tidak cukup");
      }

   }
