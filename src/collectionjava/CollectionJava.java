/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class CollectionJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mảng: Độ dài của mảng phải được quy định sẵn,
        /**
         * - Dùng con trỏ để chỉ định các phần tử thứ cấp của mảng.
         * - Các thao tác như thêm, xóa, sửa, đọc là phụ thuộc vào vị trí chỉ định của phần tử
         * - Các thao tác này phải thực hiện bằng tay.
         * - Các thuật toán để xử lí là phải viết tay và không đảm bảo tính đúng hoàn toàn
         * nếu không test kĩ.
         * 
         * Collection: Độ dài của nó không có giới hạn, phụ thuộc vào độ lớn của RAM
         * và sẽ chỉ hết khi RAM đã được sử dụng hết. => VÔ HẠN!!!
         * Collection có nhiều loại: List (tương tự như array), Set (cũng là List nhưng 
         * sẽ không cho phép trùng lặp phần tử), Map (MAD) => Đồ thị
         * - List: interface, nó sẽ được kế thừa bởi các class con khác đã được viết sẵn bởi 
         * bộ thư viện JDK (Java Development Kit)
         *  + ArrayList<T> (T : generic class): Danh sách phần tử đi theo index.
         *  + LinkedList<T> (T : generic class): Danh sách phần tử nhưng không đi theo index.
         * => Duyệt hết thì mới lấy được phần tử tại vị trí index.
         * 1 (node -> 2) -> 2(node -> 3) -> 3 (CSD201 Semester 3)
         * - Set: interface, nó sẽ được kế thừa bởi các class con khác đã được viết sẵn ....
         * Nhưng so với List thì thằng Set không được phép có các phần tử trùng nhau.
         *  + HashSet<T> : y chang như thằng cha nó => Set
         * - Map<K, V> : query theo giá trị key.
         *  + Giá trị key là vị trí mà nó sẽ chứa các thông tin mình cần
         *  Lấy ví dụ: có 2 chìa khóa, một chìa khóa có key để vào được thông tin của thùng hàng số 1
         *             1 chìa khóa nữa là có key để vào được thông tin của thùng hàng số 2
         * -> Mình gọi tên nó: getKey("Nguyễn Văn A") => sẽ lấy được Value (thông tin chi tiết) của thằng Nguyễn Văn A
         * INTERFACE không bao giờ có code, mà chỉ chứa một bộ các quy tắc, mà bắt buộc các class khác phải tuân theo hoặc sử dụng nó.
         * Vòng for each: sẽ dùng để duyệt các phần tử thuộc mảng hoặc collection mà không cần dựa vào vị trí
         * Cấu trúc của vòng for each:
         * for (kiểu_dữ_liệu tên_biến_đại_diện : danh_sách)
         * 
         * try .. catch là dùng để bắt ngoại lệ, tức là ngoại lệ này sẽ được xử lí bởi phương thức
         * catch nếu có ngoại lệ
         * 
         * 
         * Stack, Queue:
         * - Stack: ngăn xếp, cũng là List, nhưng cơ chế hoạt động sẽ khác
         * hoạt động dựa trên cơ chế LIFO (Last In First Out) 
         * Giống cái chồng sách, cứ chồng chất lên thì đến 1 lúc nào đó nó sẽ đầy, và muốn lấy
         * thì chỉ có cách lấy từ thằng vừa đưa vào trước đó
         * VD: Stack gồm 5 phần tử: 1 2 3 4 5 => khi duyệt thì thằng số 5 sẽ bị lôi ra đầu tiên
         * 
         * - Queue: hàng đợi, ngược lại với Stack,
         * hoạt động theo cơ chế FIFO (First In First Out)
         * Ví dụ: Queue có 5 phần tử: 1 2 3 4 5 => khi duyệt thì thằng số 1 sẽ bị lôi ra đầu tiên.
         */
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        try {
//            //Xóa 
//            int checkRemove = list.remove(2);
//            System.out.println("Mày vừa xóa vị trí thứ 2 trong list của tao: " + checkRemove);
//            for (Integer integer : list) {
//                System.out.println(integer);
//            }
        } catch (Exception ex) {
            System.out.println("Mày ngu thế, làm đéo gì có index 3!");
        }
    }
    
}
