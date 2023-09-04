import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int last=1000000001,cnt=0;
        int[] a=new int[n];
        ArrayList<Integer> list=new ArrayList<>(n);
        HashMap<Integer,Integer> map=new HashMap<>();
        StringTokenizer st=new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            list.add(a[i]);
        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            if(last!=list.get(i)){
                last=list.get(i);
                map.put(last,cnt++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(map.get(a[i])).append(" ");
        }
        System.out.println(sb);
    }
}