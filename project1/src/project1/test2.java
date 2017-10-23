package l1;

import java.util.ArrayList; 

public class test2 {
  static int[][] graph;
  static int length = graph.length;
  private static boolean[] hasFlag = new boolean[graph.length];
     
  static ArrayList<String> res = new ArrayList<String>();
    //�������е�·���Ľ����ÿһ��·���ĸ�ʽ���磺0->2->1->3:7
     
    //����ͼgraph��Դ��s��Ŀ���d֮�����еļ�·���������·���ĺ͡�   
  public static void getPaths(int s,int d,String path,int sum){
    hasFlag[s] = true;//Դ���ѷ��ʹ�. 
    for (int i = 0;i < length;i++) {

      if (graph[s][i]==-1 || hasFlag[i]){continue; }
        //����·��ͨ���ѷ��ʹ���������һ����㡣
 
      if (i == d)//�����ҵ�һ��·��
        { 
            res.add(path+"->"+d+":"+(sum+graph[s][i]));//��������
            continue;
        }
        getPaths(i, d, path+"->"+i, sum+graph[s][i]);//������
        hasFlag[i]=false;       
     }//for(i)
    }
      
    public static void main(String[] args) {

    	for (int i=0;i<length;i++)
		{
			for (int j=0;j<length;j++)
			{
				System.out.print(graph[i][j]);System.out.print(' ');
			}
			System.out.print("\n");
		}
      getPaths(0, 3, ""+0, 0);//��Դ�㣺0 ��Ŀ�㣺3,��ʼ·����"0" ��ʼ�ͣ�0
      System.out.println(length);
      for(String e:res)//��ӡ���еĽ��
      {
          System.out.println(e);
      }
    }
}
