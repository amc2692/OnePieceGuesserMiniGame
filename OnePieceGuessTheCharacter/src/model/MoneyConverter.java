package model;

public class MoneyConverter {

	public static String moneyConversorString(int amount) {
		if (amount == 0) {
			return "0";
		} else {
			String amountString = String.valueOf(amount);
			StringBuilder sb = new StringBuilder();
			sb.append("000.");
			int cont = 0;
			for (int i = amountString.length(); i > 0; i--) {
				sb.append(amountString.charAt(i - 1));
				cont++;
				if (cont == 3 && i != 1) {
					sb.append(".");
					cont = 0;
				}
			}
			sb.append(" $B").reverse();
			return sb.toString();
		}
	}
}
