package com.young.tools;
//MD5 压缩算法代码
public class MD5 {
    /**
     * 传入参数：一个字节数组
     * 传出参数：字节数组的 MD5 结果字符串
     */
    public static String getMD5(byte[] source) {
        String s = null;
        // 用来将字节转换成十六进制表示的字符
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance( "MD5" );
            md.update( source );
            // MD5 的计算结果是一个 128 位的长整数，用字节表示就是 16 个字节
            byte tmp[] = md.digest();
            // 每个字节用十六进制表示的话，使用两个字符，所以表示成十六进制需要 32 个字符
            char str[] = new char[16 * 2];
            // 表示转换结果中对应的字符位置
            int k = 0;
            // 从第一个字节开始，将 MD5 的每一个字节转换成十六进制字符
            for (int i = 0; i < 16; i++) {
                // 取第 i 个字节
                byte byte0 = tmp[i];
                // 取字节中高 4 位的数字转换，>>> 为逻辑右移，将符号位一起右移
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                // 取字节中低 4 位的数字转换
                str[k++] = hexDigits[byte0 & 0xf];
            }
            // 将换后的结果转换为字符串
            s = new String(str);
        }catch( Exception e ) {
            e.printStackTrace();
        }
        return s;
    }
}
