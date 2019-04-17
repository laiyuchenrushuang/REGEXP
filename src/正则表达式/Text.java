package ������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

	public static void main(String[] args) {
		String[] regEx = {
						   "^^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$",//����
				           "\\d{11}",//�ֻ�����
				           "\\d{3}-\\d{8}|\\d{4}-\\d{7}",//������������ 
				           "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$",//���֤����X
				           "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)",//�绰����(�����ֻ�����)
				           "^[a-zA-Z0-9_-]{4,16}$",//�ʺ��Ƿ�Ϸ�(����4-16�ֽڣ�������ĸ�����»��߼���)
				           "^[a-zA-Z0-9]{5,16}$",//����(������6~16֮�䣬ֻ�ܰ�����ĸ������)
				           "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$",//ǿ����(���������Сд��ĸ�����ֵ���ϣ�����ʹ�������ַ���������8-10֮��)
				           "^\\d{4}-\\d{1,2}-\\d{1,2}",//���ڸ�ʽ
				           "[1-9][0-9]{4,}",//qq����
				           "[1-9]\\d{5}(?!\\d)",//�ʱ�
				           "^(?:(?:1[0-9][0-9]\\.)|(?:2[0-4][0-9]\\.)|(?:25[0-5]\\.)|(?:[1-9][0-9]\\.)|(?:[0-9]\\.)){3}(?:(?:1[0-9][0-9])|(?:2[0-4][0-9])|(?:25[0-5])|(?:[1-9][0-9])|(?:[0-9]))$",//IP��ַ
				           "^[�����弽ԥ���ɺ�����³������Ӷ���ʽ����¼���������ش�����ʹ��A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9��ѧ���۰�]{1}$",//���ƺ�����
				           "([0-1][0-9]\\:|2[0-3]\\:)([0-5][0-9]\\:)[0-5][0-9]",//ƥ��ʱ��
				           "[^\\x00-\\xff]{0,}\\:",//����
				           "[0-9]{0,}",//ƥ�䔵��
				           "",
		};
		macherString(regEx[0],"tony@erene.com.com");
		macherString(regEx[1], "17610071266");
		macherString(regEx[2], "028-25253565");
		macherString(regEx[3], "51052119900210071X");
		macherString(regEx[4], "0282-2525256");
		macherString(regEx[5], "1aA_-@2");
		macherString(regEx[6], "666_666");
		macherString(regEx[7], "aA822568");
		macherString(regEx[8], "2019-02-19");
		macherString(regEx[9], "383209920");
		macherString(regEx[10], "626100");
		macherString(regEx[11], "192.168.1.10");
		macherString(regEx[12], "��A225KB");
		macherString(regEx[13], "18:06:00");
		macherString(regEx[14], "����:");
		macherString(regEx[15], "1212135");
	}

	private static void macherString(String regEx, String matherString) {
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(matherString);
		System.out.println(matherString +" ƥ�䣺"+matcher.matches());
	}

}
