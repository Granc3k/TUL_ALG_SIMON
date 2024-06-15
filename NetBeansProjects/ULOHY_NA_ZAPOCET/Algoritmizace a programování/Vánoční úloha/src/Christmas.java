//Designed by Tomáš Moravec
import java.util.concurrent.TimeUnit;
public class Christmas {
    /*
    No comments for you
    it was hard to write
    so it should be hard to read
    */
    public static void main(String[] args) throws InterruptedException {
        for (int step = 1; step <= 4; step++){
            Clear(); Move(step); TimeUnit.MILLISECONDS.sleep(220); 
            if (step == 4) step = 0;
        }
    }
    public static void Move(int step){
        switch (step){
            case 1: {
                System.out.println("   *                       *              *              ");//1
                System.out.println("                                                         ");//2
                System.out.println("                         * * * *                 *       ");//3
                System.out.println("             *          * * * * *                        ");//4
                System.out.println("    *                   * * * * *       *                ");//5
                System.out.println("                        * * * * *                        ");//6
                System.out.println("         *        * * * * * * * * * * *                  ");//7
                System.out.println("       *   *      * * * * * * * * * * *      *   *    *  ");//8
                System.out.println("         * *          *   •   •   *          * *         ");//9
                System.out.println("  *    * * *         *      |      *         * * *       ");//10
                System.out.println("             *       *    \\___/    *       *            ");//11
                System.out.println("     *         *      *           *      *           *   ");//12
                System.out.println(" *               *      * * * * *      *     *           ");//13
                System.out.println("            *      * *             * *                   ");//14
                System.out.println("                    *               *                    ");//15
                System.out.println("       *            *               *              *     ");//16
                System.out.println("                     *             *     *               ");//17
                System.out.println("              *         * * * * *                        ");//18
                System.out.println("     *                *           *                      ");//19
                System.out.println("                   *                 *         *         ");//20
                System.out.println("          *       *                   *                  ");//21
                System.out.println("                 *                     *             *   ");//22
                System.out.println("                 *                     *    *            ");//23
                System.out.println("    *             *                   *                  ");//24
                System.out.println("                    *               *           *        ");//25
                System.out.println("             *        * * * * * * *                    * ");//26
                break;
            }
            case 2: {
                System.out.println("          *             *                                ");//1
                System.out.println("                                                     *   ");//2
                System.out.println("                         * * * *            *            ");//3
                System.out.println("    *                   * * * * *                        ");//4
                System.out.println("                        * * * * *               *        ");//5
                System.out.println("             *          * * * * *                      * ");//6
                System.out.println("   *              * * * * * * * * * * *   *              ");//7
                System.out.println("                  * * * * * * * * * * *                  ");//8
                System.out.println("                      *   •   •   *              *       ");//9
                System.out.println("             *       *      |      *                     ");//10
                System.out.println("    *                *    \\___/    *   *                ");//11
                System.out.println("    **                *           *                 *    ");//12
                System.out.println("      *  *              * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *             * *  *  *  *  * * **  ");//14
                System.out.println("      *             *               *             *      ");//15
                System.out.println("  * *               *               *               *    ");//16
                System.out.println("                     *             *                     ");//17
                System.out.println("                        * * * * *                    *   ");//18
                System.out.println(" *                    *           *          *           ");//19
                System.out.println("            *      *                 *                   ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("       *         *                     *           *     ");//22
                System.out.println("                 *                     * *               ");//23
                System.out.println("                * *                   *                  ");//24
                System.out.println("     *              *               *                    ");//25
                System.out.println("                      * * * * * * *            *         ");//26
                break;
            }
            case 3: {
                System.out.println("                             *                           ");//1
                System.out.println("       *                                           *     ");//2
                System.out.println("                         * * * *         *               ");//3
                System.out.println("                        * * * * *                        ");//4
                System.out.println("                *       * * * * *                        ");//5
                System.out.println("     *                  * * * * *              *         ");//6
                System.out.println("          *       * * * * * * * * * * *                  ");//7
                System.out.println("                  * * * * * * * * * * *              *   ");//8
                System.out.println("                      *   •   •   *         *            ");//9
                System.out.println("    *                *      |      *                     ");//10
                System.out.println("                     *    \\___/    *           *        ");//11
                System.out.println("              *       *           *                    * ");//12
                System.out.println("   *                    * * * * *         *              ");//13
                System.out.println("                   * *             * *                   ");//14
                System.out.println("                 *  *               *  *         *       ");//15
                System.out.println("              **    *               *    *               ");//16
                System.out.println("             *       *             *    *  *             ");//17
                System.out.println("    *  * * *            * * * * *            * * *       ");//18
                System.out.println("         * *          *           *          * *         ");//19
                System.out.println("       *   *       *                 *       *   *    *  ");//20
                System.out.println("                  *                   *                  ");//21
                System.out.println("  *              *                     *                 ");//22
                System.out.println("                 *                     *                 ");//23
                System.out.println("                  *                   *              *   ");//24
                System.out.println(" *                  *               *         *          ");//25
                System.out.println("            *         * * * * * * *                      ");//26
                break;
            }
            case 4: {
                System.out.println("                                                         ");//1
                System.out.println("  *                                                      ");//2
                System.out.println("               *         * * * *                         ");//3
                System.out.println("                        * * * * *                    *   ");//4
                System.out.println(" *                      * * * * *             *          ");//5
                System.out.println("            *           * * * * *                        ");//6
                System.out.println("                  * * * * * * * * * * *                  ");//7
                System.out.println("       *          * * * * * * * * * * *            *     ");//8
                System.out.println("                      *   •   •   *      *               ");//9
                System.out.println("                     *      |      *                     ");//10
                System.out.println("                *    *    \\___/    *                    ");//11
                System.out.println("    **                *           *            *    *    ");//12
                System.out.println("      *   *             * * * * *                 *      ");//13
                System.out.println("   * * *  *  *  *  * *             * *  *  *  *  * * *   ");//14
                System.out.println("      *             *               *       *     *      ");//15
                System.out.println("    *               *               *               *    ");//16
                System.out.println("                     *             *            *        ");//17
                System.out.println("              *         * * * * *                      * ");//18
                System.out.println("   *                  *           *       *              ");//19
                System.out.println("                   *                 *                   ");//20
                System.out.println("                  *                   *          *       ");//21
                System.out.println("              *  *                     *                 ");//22
                System.out.println("                 *                     **                ");//23
                System.out.println("    *             *                   *                  ");//24
                System.out.println("         *          *               *                    ");//25
                System.out.println("                      * * * * * * *                   *  ");//26
                break;
            }
        }
    }
    public static void Clear(){
        for (int i=0; i<100; i++){
            System.out.println();
        }
    }
}