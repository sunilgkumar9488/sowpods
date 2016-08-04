public static String sortString(String str)
	{
		
		char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
	} 